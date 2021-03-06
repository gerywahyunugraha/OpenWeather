package app.location;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class City implements Serializable {

  @SerializedName("id")
  @Expose
  private Integer id;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("country")
  @Expose
  private String country;
  @SerializedName("coord")
  @Expose
  private Coord coord;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Coord getCoord() {
    return coord;
  }

  public void setCoord(Coord coord) {
    this.coord = coord;
  }

  @Override
  public String toString() {
    return name + " " + country;
  }

}