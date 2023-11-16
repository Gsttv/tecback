package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name = "tb_filme")
@Data
public class Filme extends Conteudo implements Serializable {

}
