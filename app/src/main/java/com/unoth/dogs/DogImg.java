package com.unoth.dogs;

public class DogImg {
    private String message;
    private String status;

    public DogImg(String message, String status) {
        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "DogImg{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
