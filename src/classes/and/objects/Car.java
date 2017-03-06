/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.and.objects;

/**
 *
 * @author ian
 */
public class Car {

    private int mWheels;
    private String mModel;
    private String mTransmission;
    private String mColor;

    public Car(int mWheels, String mModel, String mTransmission, String mColor) {
        this.mWheels = mWheels;
        this.mModel = mModel;
        this.mTransmission = mTransmission;
        this.mColor = mColor;
    }
    
        public Car(int mWheels, String mModel) {
        this.mWheels = mWheels;
        this.mModel = mModel;
    }
    

    public int getmWheels() {
        return mWheels;
    }

    public void setmWheels(int mWheels) {
        if (mWheels < 4) {
            System.out.println("invalid number of wheels");
        } else {
            this.mWheels = mWheels;

        }
    }

    public String getmModel() {
        return mModel;
    }

    public void setmModel(String mModel) {
        this.mModel = mModel;
    }

    public String getmTransmission() {
        return mTransmission;
    }

    public void setmTransmission(String mTransmission) {
        this.mTransmission = mTransmission;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

}
