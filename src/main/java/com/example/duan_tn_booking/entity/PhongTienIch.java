
import javax.persistence.*;

@Entity
@Table(name = "PhongTienIch")
public class PhongTienIch {
    @Id
    @Column(name = "id_phong_tien_ich")
    private Integer idPhongTienIch;

    @Column(name = "id_phong")
    private Integer idPhong;

    @Column(name = "id_tien_ich_phong")
    private Integer idTienIchPhong;

    @Column(name = "id_chi_tiet_phong")
    private Integer idChiTietPhong;

    public Integer getIdPhongTienIch() {
        return this.idPhongTienIch;
    }

    public void setIdPhongTienIch(Integer idPhongTienIch) {
        this.idPhongTienIch = idPhongTienIch;
    }

    public Integer getIdPhong() {
        return this.idPhong;
    }

    public void setIdPhong(Integer idPhong) {
        this.idPhong = idPhong;
    }

    public Integer getIdTienIchPhong() {
        return this.idTienIchPhong;
    }

    public void setIdTienIchPhong(Integer idTienIchPhong) {
        this.idTienIchPhong = idTienIchPhong;
    }

    public Integer getIdChiTietPhong() {
        return this.idChiTietPhong;
    }

    public void setIdChiTietPhong(Integer idChiTietPhong) {
        this.idChiTietPhong = idChiTietPhong;
    }
}
