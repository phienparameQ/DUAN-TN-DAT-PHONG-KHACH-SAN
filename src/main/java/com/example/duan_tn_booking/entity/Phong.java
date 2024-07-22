
import javax.persistence.*;

@Entity
@Table(name = "Phong")
public class Phong {
    @Id
    @Column(name = "id_phong")
    private Integer idPhong;

    @Column(name = "ma_phong")
    private String maPhong;

    @Column(name = "ten_phong")
    private String tenPhong;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    @Column(name = "mo_ta")
    private null moTa;

    @Column(name = "id_loai_phong")
    private Integer idLoaiPhong;

    public Integer getIdPhong() {
        return this.idPhong;
    }

    public void setIdPhong(Integer idPhong) {
        this.idPhong = idPhong;
    }

    public String getMaPhong() {
        return this.maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return this.tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Boolean getTinhTrang() {
        return this.tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
    }

    public Integer getIdLoaiPhong() {
        return this.idLoaiPhong;
    }

    public void setIdLoaiPhong(Integer idLoaiPhong) {
        this.idLoaiPhong = idLoaiPhong;
    }
}
