package com.example.proyectoam;

public class Usuario {
    private int _id;
    private String _nombre;
    private String _contrasena;
    private String _correo;
    private String _cargo;

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getContrasena() {
        return _contrasena;
    }

    public void setContrasena(String _contrasena) {
        this._contrasena = _contrasena;
    }

    public String getCorreo() {
        return _correo;
    }

    public void setCorreo(String _correo) {
        this._correo = _correo;
    }

    public String getCargo() {
        return _cargo;
    }

    public void setCargo(String _cargo) {
        this._cargo = _cargo;
    }
}
