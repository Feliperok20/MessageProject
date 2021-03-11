package br.com.broscoder.simpleproject.constants;

public enum Path {

    MainPath("http://localhost:8080/");

    private final String address;

    Path(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
