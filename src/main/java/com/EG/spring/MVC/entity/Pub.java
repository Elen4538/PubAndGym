package com.EG.spring.MVC.entity;

import javax.persistence.*;

/**
 * @author elena
 */

@Entity
@Table(name = "Pubs")
public class Pub {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "rating")
    private double rating;

    @Column(name = "type")
    private String type;

    @Column( name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "opening_hours")
    private String openingHours;

    @Column(name = "additional_information")
    private String additionalInformation;

    @Column(name = "postcode")
    private String postcode;

    public Pub() {
    }

    public Pub(String name, double latitude, double longitude, double rating, String type, String address, String phone, String openingHours, String additionalInformation, String postcode) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
        this.type = type;
        this.address = address;
        this.phone = phone;
        this.openingHours = openingHours;
        this.additionalInformation = additionalInformation;
        this.postcode = postcode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Override
    public String toString() {
        return "Pub{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", rating=" + rating +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", openingHours='" + openingHours + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
