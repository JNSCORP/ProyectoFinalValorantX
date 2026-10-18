package com.valorantx.data.entity;
import jakarta.persistence.*; import java.time.LocalDateTime;
@Entity @Table(name="Usuarios")
public class Usuario {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
 @Column(name="NombreUsuario",nullable=false,unique=true) private String nombreUsuario;
 @Column(name="Correo",nullable=false,unique=true) private String correo;
 @Column(name="Contrasena",nullable=false) private String contrasena;
 @Column(name="FechaRegistro",nullable=false) private LocalDateTime fechaRegistro;
 @PrePersist public void prePersist(){if(fechaRegistro==null)fechaRegistro=LocalDateTime.now();}
 public Integer getId(){return id;} public void setId(Integer v){id=v;} public String getNombreUsuario(){return nombreUsuario;} public void setNombreUsuario(String v){nombreUsuario=v;} public String getCorreo(){return correo;} public void setCorreo(String v){correo=v;} public String getContrasena(){return contrasena;} public void setContrasena(String v){contrasena=v;} public LocalDateTime getFechaRegistro(){return fechaRegistro;} public void setFechaRegistro(LocalDateTime v){fechaRegistro=v;}
}
