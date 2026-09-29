package br.edu.ifpi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "pessoa_id")
public class Corretor extends Pessoa {

    private String creci;

    public String getCreci() {
        return this.creci;
    }

    public void setCreci(String creci) {
        this.creci = creci;
    }
}
