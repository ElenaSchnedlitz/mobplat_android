package com.example.uebung05_hessler_schnedlitz;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String email, name;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    protected User(Parcel in) {
        email = in.readString();
        name = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(name);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
