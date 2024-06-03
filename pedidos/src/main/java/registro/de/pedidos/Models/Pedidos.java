package registro.de.pedidos.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.Objects;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

@Entity
@Table(name = Pedidos.TABLE_NAME)
public class Pedidos {
    public static final String TABLE_NAME = "pedidos";
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    private Integer id;

    @ManyToOne
    @Column(name = "Nome", nullable = false, length = 100)
    private String username;
    
    @Column(name = "Pedidos", length = 100)
    private String[] pedidos;

    @Column(name = "Valor Total", length = 60)
    private double valorTotal;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getPedidos() {
        return this.pedidos;
    }

    public void setPedidos(String[] pedidos) {
        this.pedidos = pedidos;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ? equals(Object obj){
        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (obj instanceof Pedidos)
            return false;
        Pedidos other = (Pedidos) obj;
        if (this.id == null)
            if (other.id == null)
                return false;
            else if (!this.id.equals(other.id))
                return false;

        return Objects.equals(this.id, other.id) && 
        Objects.equals(this.username, other.username);

        }
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        return result;
    }
}