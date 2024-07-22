
import javax.persistence.*;

@Entity
@Table(name = "LoaiPhong")
public class LoaiPhong {
    @Id
    @Column(name = "id_loai_phong")
    private Integer idLoaiPhong;

    @Column(name = "ma_loai_phong")
    private String maLoaiPhong;

    @Column(name = "ten_loai_phong")
    private String tenLoaiPhong;

    @Column(name = "mo_ta")
    private null moTa;

    @Column(name = "so_luong_giuong")
    private Integer soLuongGiuong;

    @Column(name = "so_nguoi_toi_da")
    private Integer soNguoiToiDa;

    @Column(name = "gia")
    private BigDecimal gia;

    public Integer getIdLoaiPhong() {
        return this.idLoaiPhong;
    }

    public void setIdLoaiPhong(Integer idLoaiPhong) {
        this.idLoaiPhong = idLoaiPhong;
    }

    public String getMaLoaiPhong() {
        return this.maLoaiPhong;
    }

    public void setMaLoaiPhong(String maLoaiPhong) {
        this.maLoaiPhong = maLoaiPhong;
    }

    public String getTenLoaiPhong() {
        return this.tenLoaiPhong;
    }

    public void setTenLoaiPhong(String tenLoaiPhong) {
        this.tenLoaiPhong = tenLoaiPhong;
    }

    public null getMoTa() {
        return this.moTa;
    }

    public void setMoTa(null moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongGiuong() {
        return this.soLuongGiuong;
    }

    public void setSoLuongGiuong(Integer soLuongGiuong) {
        this.soLuongGiuong = soLuongGiuong;
    }

    public Integer getSoNguoiToiDa() {
        return this.soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public BigDecimal getGia() {
        return this.gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }
}
