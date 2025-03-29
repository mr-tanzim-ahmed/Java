package weatherapp;

import java.awt.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WeatherApp {

    public static void main(String[] args) {
        //  frame
        JFrame frame = new JFrame("Weather App");
        frame.setSize(600, 550);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Weather App");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        topPanel.add(titleLabel);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel cityLabel = new JLabel("Enter City:");
        JTextField cityField = new JTextField(15);

  
        JButton getWeatherButton = new JButton("Get Weather");

        // input panel
        inputPanel.add(cityLabel);
        inputPanel.add(cityField);
        
        inputPanel.add(getWeatherButton);

        // Table
        String[] columnNames = {"Parameter", "Value"};
        Object[][] data = {
            {"Today's Date", ""},
            {"Local Time", ""},
            {"Temperature", ""},
            {"Humidity", ""},
            {"Pressure", ""},
            {"Air Quality Index", ""}
        };
        JTable weatherTable = new JTable(data, columnNames);

    
        weatherTable.setRowHeight(50);
        weatherTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        weatherTable.getColumnModel().getColumn(1).setPreferredWidth(300);

    
        JScrollPane tableScrollPane = new JScrollPane(weatherTable);
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add 10px margin around the table
        tablePanel.add(tableScrollPane);

    
        frame.setLayout(new BorderLayout());
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(tablePanel, BorderLayout.SOUTH);

     
        getWeatherButton.addActionListener(e -> {
            String city = cityField.getText();
            if (city.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a city name.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String apiKey = "2282afc4174b6b10cb82fe5cb5e566dd"; // Replace with your API key
            DecimalFormat df = new DecimalFormat("#.##");

            try {
               
                String weatherUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + URLEncoder.encode(city, "UTF-8") + "&appid=" + apiKey;
                URL url = new URL(weatherUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                int responseCode = conn.getResponseCode();
                if (responseCode != 200) {
                    JOptionPane.showMessageDialog(frame, "Error: " + responseCode, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                JsonObject jsonResponse = JsonParser.parseString(response.toString()).getAsJsonObject();

                // Parse temperature, humidity, pressure, and coordinates
                JsonObject main = jsonResponse.getAsJsonObject("main");
                double temperature = main.get("temp").getAsDouble();
                int humidity = main.get("humidity").getAsInt();
                int pressure = main.get("pressure").getAsInt();

                // Fetch current local time from the system
                LocalDateTime localDateTime = LocalDateTime.now();
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm a");
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                String localTime = localDateTime.format(timeFormatter);
                String todayDate = localDateTime.format(dateFormatter);

                // API 
                String aqiUrl = "https://api.openweathermap.org/data/2.5/air_pollution?lat=" + jsonResponse.getAsJsonObject("coord").get("lat").getAsDouble() + "&lon=" + jsonResponse.getAsJsonObject("coord").get("lon").getAsDouble() + "&appid=" + apiKey;
                URL aqiApiUrl = new URL(aqiUrl);
                HttpURLConnection aqiConn = (HttpURLConnection) aqiApiUrl.openConnection();
                aqiConn.setRequestMethod("GET");
                aqiConn.connect();

                String aqiDescription = "Unavailable";
                int aqiResponseCode = aqiConn.getResponseCode();
                if (aqiResponseCode == 200) {
                    BufferedReader aqiReader = new BufferedReader(new InputStreamReader(aqiConn.getInputStream()));
                    StringBuilder aqiResponse = new StringBuilder();
                    while ((line = aqiReader.readLine()) != null) {
                        aqiResponse.append(line);
                    }
                    aqiReader.close();

                    JsonObject aqiJson = JsonParser.parseString(aqiResponse.toString()).getAsJsonObject();
                    int aqi = aqiJson.getAsJsonArray("list").get(0).getAsJsonObject().getAsJsonObject("main").get("aqi").getAsInt();

                    aqiDescription = switch (aqi) {
                        case 1 -> "Good";
                        case 2 -> "Fair";
                        case 3 -> "Moderate";
                        case 4 -> "Poor";
                        case 5 -> "Very Poor";
                        default -> "Unknown";
                    };
                    aqiDescription += " (" + aqi + ")";
                }

                weatherTable.setValueAt(todayDate, 0, 1);
                weatherTable.setValueAt(localTime, 1, 1);
                weatherTable.setValueAt(df.format(temperature - 273.15) + "°C", 2, 1);
                weatherTable.setValueAt(humidity + "%", 3, 1);
                weatherTable.setValueAt(pressure + " hPa", 4, 1);
                weatherTable.setValueAt(aqiDescription, 5, 1);

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error fetching data. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
