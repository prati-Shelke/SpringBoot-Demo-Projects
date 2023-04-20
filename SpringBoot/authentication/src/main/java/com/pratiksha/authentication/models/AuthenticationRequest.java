package com.pratiksha.authentication.models;

public class AuthenticationRequest 
{
    private String email;
    private String password;
    private String newPassword;
    private String confirmPassword;
    
    public AuthenticationRequest() {
    }

    public AuthenticationRequest(String email, String password, String newPassword, String confirmPassword) {
        this.email = email;
        this.password = password;
        this.newPassword = newPassword;
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    
    
    
    
}
