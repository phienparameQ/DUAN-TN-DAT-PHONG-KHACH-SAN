
import javax.persistence.*;

@Entity
@Table(name = "DienTichPhong")
public class DienTichPhong {
    @Id
    @Column(name = "id_dien_tich")
    private Integer idDienTich;

    @Column(name = "dien_tich")
    private null dienTich;

    @Column(name = "mo_ta")
    private null moTa;

    public Integer getIdDienTich() {
        return this.idDienTich;
    }

    public void setIdDienTich(Integer idDienTich) {
        this.idDienTich = idDienTich;
    }

    public null getDienTich() {
        return this.dienTich;
    }

    public void setDienTich(null dienTich) {
        this.dienTich = dienTich;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
    }
}
