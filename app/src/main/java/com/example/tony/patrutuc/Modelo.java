package com.example.tony.patrutuc;



public class Modelo {


    private String idDenuncia, dni, apellido, nombre,  lugar_del_hecho, horario,
            nombre_del_agente, tipo_de_delito, hora_de_denuncia,
            cod_seguridad, breve_descripcion;


    public Modelo() {

    }


    public Modelo(String idDenuncia, String dni, String apellido, String nombre, String lugar_del_hecho, String horario,
                  String nombre_del_agente, String tipo_de_delito, String hora_de_denuncia, String cod_seguridad, String breve_descripcion) {
        this.idDenuncia = idDenuncia;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.lugar_del_hecho = lugar_del_hecho;
        this.horario = horario;
        this.nombre_del_agente = nombre_del_agente;
        this.tipo_de_delito = tipo_de_delito;
        this.hora_de_denuncia = hora_de_denuncia;
        this.cod_seguridad = cod_seguridad;
        this.breve_descripcion = breve_descripcion;
    }

    public String getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(String idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar_del_hecho() {
        return lugar_del_hecho;
    }

    public void setLugar_del_hecho(String lugar_del_hecho) {
        this.lugar_del_hecho = lugar_del_hecho;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNombre_del_agente() {
        return nombre_del_agente;
    }

    public void setNombre_del_agente(String nombre_del_agente) {
        this.nombre_del_agente = nombre_del_agente;
    }

    public String getTipo_de_delito() {
        return tipo_de_delito;
    }

    public void setTipo_de_delito(String tipo_de_delito) {
        this.tipo_de_delito = tipo_de_delito;
    }

    public String getHora_de_denuncia() {
        return hora_de_denuncia;
    }

    public void setHora_de_denuncia(String hora_de_denuncia) {
        this.hora_de_denuncia = hora_de_denuncia;
    }

    public String getCod_seguridad() {
        return cod_seguridad;
    }

    public void setCod_seguridad(String cod_seguridad) {
        this.cod_seguridad = cod_seguridad;
    }

    public String getBreve_descripcion() {
        return breve_descripcion;
    }

    public void setBreve_descripcion(String breve_descripcion) {
        this.breve_descripcion = breve_descripcion;
    }

    @Override
    public String toString() {
        return  "  DNI              =" + dni + '\n' +
                ", apellido         =" + apellido + '\n' +
                ", nombre           =" + nombre + '\n' +
                ", lugar_del_hecho  =" + lugar_del_hecho + '\n' +
                ", horario          =" + horario + '\n' +
                ", nombre_del_agente=" + nombre_del_agente + '\n' +
                ", tipo_de_delito   =" + tipo_de_delito + '\n' +
                ", hora_de_denuncia =" + hora_de_denuncia + '\n' +
                ", cod_seguridad    =" + cod_seguridad + '\n' +
                ", breve_descripcion=" + breve_descripcion + '\n' +
                '}';
    }
}
