package com.cydeo.schoollab.dto.weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "observation_time",
        "temperature",
        "weather_code",
        "weather_icons",
        "weather_descriptions",
        "wind_speed",
        "wind_degree",
        "wind_dir",
        "pressure",
        "precip",
        "humidity",
        "cloudcover",
        "feelslike",
        "uv_index",
        "visibility",
        "is_day"})
@Generated("jsonschema2pojo")
public class Current {

    @JsonProperty("observation_time")
    private String observationTime;

    public String getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(String observationTime) {
        this.observationTime = observationTime;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherDescritions() {
        return weatherDescritions;
    }

    public void setWeatherDescritions(List<String> weatherDescritions) {
        this.weatherDescritions = weatherDescritions;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindDegree() {
        return windDegree;
    }

    public void setWindDegree(Integer windDegree) {
        this.windDegree = windDegree;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Integer getPrecip() {
        return precip;
    }

    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(Integer cloudcover) {
        this.cloudcover = cloudcover;
    }

    public Integer getFeelslike() {
        return feelslike;
    }

    public void setFeelslike(Integer feelslike) {
        this.feelslike = feelslike;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    @JsonProperty("temperature")
    private String temperature;

    @JsonProperty("weather_code")
    private String weatherCode;

    @JsonProperty("weather_icons")
    private List<String> weatherIcons;

    @JsonProperty("weather_descriptions")
    private List<String> weatherDescritions;

    @JsonProperty("wind_Speed")
    private Integer windSpeed;

    @JsonProperty("wind_Degree")
    private Integer windDegree;

    @JsonProperty("Wind_Dir")
    private String windDir;

    @JsonProperty("pressure")
    private Integer pressure;

    @JsonProperty("precip")
    private Integer precip;

    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("cloudcover")
    private Integer cloudcover;

    @JsonProperty("feelslike")
    private Integer feelslike;

    @JsonProperty("uv_index")
    private Integer uvIndex;

    @JsonProperty("visibility")
    private Integer visibility;

    @JsonProperty("is_Day")
    private String isDay;








}
