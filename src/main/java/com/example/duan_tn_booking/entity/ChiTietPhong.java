
import javax.persistence.*;

@Entity
@Table(name = "ChiTietPhong")
public class ChiTietPhong {
    @Id
    @Column(name = "id_chi_tiet_phong")
    private Integer idChiTietPhong;

    @Column(name = "so_luong")
    private String soLuong;

    @Column(name = "gia")
    private BigDecimal gia;

    @Column(name = "trangThai")
    private Boolean trangThai;

    @Column(name = "id_phong")
    private Integer idPhong;

    @Column(name = "id_tang")
    private Integer idTang;

    @Column(name = "id_dien_tich")
    private Integer idDienTich;

    public Integer getIdChiTietPhong() {
        return this.idChiTietPhong;
    }

    public void setIdChiTietPhong(Integer idChiTietPhong) {
        this.idChiTietPhong = idChiTietPhong;
    }

    public String getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGia() {
        return this.gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public Boolean getTrangThai() {
        return this.trangThai;
    }

    public void setTrangThai(Boolean trangThai) {
        this.trangThai = trangThai;
    }

    public Integer getIdPhong() {
        return this.idPhong;
    }

    public void setIdPhong(Integer idPhong) {
        this.idPhong = idPhong;
    }

    public Integer getIdTang() {
        return this.idTang;
    }

    public void setIdTang(Integer idTang) {
        this.idTang = idTang;
    }

    public Integer getIdDienTich() {
        return this.idDienTich;
    }

    public void setIdDienTich(Integer idDienTich) {
        this.idDienTich = idDienTich;
    }
}
