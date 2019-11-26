package com.example.tony.patrutuc;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;


/**
 * A simple {@link Fragment} subclass.
 */
public class Formulario extends Fragment {


    private EditText dni, apellido, nombre,  lugar_del_hecho, horario,
                     nombre_del_agente, tipo_de_delito, hora_de_denuncia,
                     cod_seguridad, breve_descripcion;
    private Button enviar_denuncia;
    private String Base_de_Datos = "Policia";
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_formulario, container, false);


        dni = (EditText)vista.findViewById(R.id.et_dni_denunciante);
        apellido = (EditText)vista.findViewById(R.id.et_apellido);
        nombre = (EditText)vista.findViewById(R.id.et_nombre);
        lugar_del_hecho = (EditText)vista.findViewById(R.id.et_lugar_del_hecho);
        horario = (EditText)vista.findViewById(R.id.et_horario);
        nombre_del_agente = (EditText)vista.findViewById(R.id.et_nombre_agente);
        tipo_de_delito = (EditText)vista.findViewById(R.id.et_tipo_de_delito);
        hora_de_denuncia = (EditText)vista.findViewById(R.id.et_horario_de_denuncia);
        cod_seguridad = (EditText)vista.findViewById(R.id.et_codigo_de_seguridad);
        breve_descripcion = (EditText)vista.findViewById(R.id.et_breve_descripcion);
        enviar_denuncia = (Button) vista.findViewById(R.id.boton_enviar_form);
        inicializarFirebase();
        enviar_denuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cargarDenuncia();
            }
        });


        return vista;
    }



    public void cargarDenuncia() {


        String id_denuncia = UUID.randomUUID().toString();
        String dni_denunciante = dni.getText().toString();
        String apellido_denunciante = apellido.getText().toString();
        String nombre_denunciate = nombre.getText().toString();
        String lugar_del_delito =lugar_del_hecho.getText().toString();
        String horario_del_delito = horario.getText().toString();
        String nombre_agente = nombre_del_agente.getText().toString();
        String tipo_delito = tipo_de_delito.getText().toString();
        String horario_de_denuncia = hora_de_denuncia.getText().toString();
        String token = cod_seguridad.getText().toString();
        String descripcion = breve_descripcion.getText().toString();
        ;
        if (dni_denunciante.equals("")||apellido_denunciante.equals("")||nombre_denunciate.equals("")||
            lugar_del_delito.equals("")||horario_del_delito.equals("")||nombre_agente.equals("")||
            tipo_delito.equals("")||horario_de_denuncia.equals("")||token.equals("")||descripcion.equals("")){
            validacion();
        }
        else {

            Modelo p = new Modelo();
            p.setIdDenuncia(id_denuncia);
            p.setDni(dni_denunciante);
            p.setApellido(apellido_denunciante);
            p.setNombre(nombre_denunciate);
            p.setLugar_del_hecho(lugar_del_delito);
            p.setHorario(horario_del_delito);
            p.setNombre_del_agente(nombre_agente);
            p.setTipo_de_delito(tipo_delito);
            p.setHora_de_denuncia(horario_de_denuncia);
            p.setCod_seguridad(token);
            p.setBreve_descripcion(descripcion);

            databaseReference.child(Base_de_Datos).child(id_denuncia).setValue(p);
            Toast.makeText(getActivity().getApplicationContext(), "Se agrego "
                    + p + " a nuestra base de datos", Toast.LENGTH_LONG).show();
            limpiarCampos();
        }

    }

    private void validacion() {
        String id_denuncia = UUID.randomUUID().toString();
        String dni_denunciante = dni.getText().toString();
        String apellido_denunciante = apellido.getText().toString();
        String nombre_denunciate = nombre.getText().toString();
        String lugar_del_delito =lugar_del_hecho.getText().toString();
        String horario_del_delito = horario.getText().toString();
        String nombre_agente = nombre_del_agente.getText().toString();
        String tipo_delito = tipo_de_delito.getText().toString();
        String horario_de_denuncia = hora_de_denuncia.getText().toString();
        String token = cod_seguridad.getText().toString();
        String descripcion = breve_descripcion.getText().toString();

        if (dni_denunciante.equals("")){
            dni.setError("Required");
        }
        else if (apellido_denunciante.equals("")){
            apellido.setError("Required");
        }
        else if (nombre_denunciate.equals("")){
            nombre.setError("Required");
        }
        else if (lugar_del_delito.equals("")){
            lugar_del_hecho.setError("Required");
        }
        else if (horario_del_delito.equals("")){
            horario.setError("Required");
        }
        else if (nombre_agente.equals("")){
            nombre_del_agente.setError("Required");
        }
        else if (tipo_delito.equals("")){
            tipo_de_delito.setError("Required");
        }
        else if (horario_de_denuncia.equals("")){
            hora_de_denuncia.setError("Required");
        }
        else if (token.equals("")){
            cod_seguridad.setError("Required");
        }
        else if (descripcion.equals("")){
            breve_descripcion.setError("Required");
        }
    }



    public void limpiarCampos() {


        dni.setText("");
        apellido.setText("");
        nombre.setText("");
        lugar_del_hecho.setText("");
        nombre_del_agente.setText("");
        cod_seguridad.setText("");
        horario.setText("");
        hora_de_denuncia.setText("");
        breve_descripcion.setText("");
        tipo_de_delito.setText("");

    }
    public void inicializarFirebase() {
        databaseReference = FirebaseDatabase.getInstance().getReference();
    }


}
