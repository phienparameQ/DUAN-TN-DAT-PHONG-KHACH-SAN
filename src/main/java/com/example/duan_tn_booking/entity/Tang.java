
import javax.persistence.*;

@Entity
@Table(name = "Tang")
public class Tang {
    @Id
    @Column(name = "id_tang")
    private Integer idTang;

    @Column(name = "ten_tang")
    private String tenTang;

    @Column(name = "mo_ta")
    private null moTa;

    public Integer getIdTang() {
        return this.idTang;
    }

    public void setIdTang(Integer idTang) {
        this.idTang = idTang;
    }

    public String getTenTang() {
        return this.tenTang;
    }

    public void setTenTang(String tenTang) {
        this.tenTang = tenTang;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
    }
}
