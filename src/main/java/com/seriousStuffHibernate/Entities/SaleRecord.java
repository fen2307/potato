package com.seriousStuffHibernate.Entities;



import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "SALE_RECORDS")
public class SaleRecord {


    private String street;
    private String city;
    private String zip;
    private String state;
    private Integer beds;
    private Integer baths;
    private Float sqFeet;
    private String type;
    private String saleDate;
    private BigDecimal price;
    private Float latitude;
    private Float longitude;

    public SaleRecord(String street, String city, String zip, String state, Integer beds, Integer baths, Float sqFeet, String type, String saleDate, BigDecimal price, Float latitude, Float longitude) {
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.sqFeet = sqFeet;
        this.type = type;
        this.saleDate = saleDate;
        this.price = price;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "saleId")
    private Integer saleId;


    public Integer getSaleId() {
        return saleId;
    }


    @Column(name = "STREET")
    public String getStreet() {
        return street;
    }

    @Column(name = "CITY")
    public String getCity() {
        return city;
    }

    @Column(name = "TYPE")
    public String getType() {
        return type;
    }

    @Column(name = "ZIP")
    public String getZip() {
        return zip;
    }

    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    @Column(name = "BEDS")
    public Integer getBeds() {
        return beds;
    }

    @Column(name = "BATHS")
    public Integer getBaths() {
        return baths;
    }

    @Column(name = "SQFEET")
    public Float getSqFeet() {
        return sqFeet;
    }

    @Column(name = "SALE_DATE")
    public String getSaleDate() {
        return saleDate;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Column(name = "LATITUDE")
    public Float getLatitude() {
        return latitude;
    }

    @Column(name = "Longitude")
    public Float getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "SaleRecord{" +
                "saleId='" + saleId + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sqFeet=" + sqFeet +
                ", type='" + type + '\'' +
                ", saleDate='" + saleDate + '\'' +
                ", price=" + price +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }

}
