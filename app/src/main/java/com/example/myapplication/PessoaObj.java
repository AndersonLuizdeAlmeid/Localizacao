package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Location;
import android.os.Bundle;

public class PessoaObj{
    public Location location;
    private Double latitude;
    private Double longitude;

    public Double getLongitude(){return longitude;}

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude(){return latitude;}

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}