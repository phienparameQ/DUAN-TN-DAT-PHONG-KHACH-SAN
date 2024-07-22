
import javax.persistence.*;

@Entity
@Table(name = "LichSuDatPhong")
public class LichSuDatPhong {
    @Id
    @Column(name = "IdLSDP")
    private Integer idLsdp;

    @Column(name = "thoi_gian_thay_doi")
    private LocalDateTime thoiGianThayDoi;

    @Column(name = "chi_tiet_thay_doi")
    private String chiTietThayDoi;

    @Column(name = "id_dat_phong")
    private Integer idDatPhong;

    public Integer getIdLsdp() {
        return this.idLsdp;
    }

    public void setIdLsdp(Integer idLsdp) {
        this.idLsdp = idLsdp;
    }

    public LocalDateTime getThoiGianThayDoi() {
        return this.thoiGianThayDoi;
    }

    public void setThoiGianThayDoi(LocalDateTime thoiGianThayDoi) {
        this.thoiGianThayDoi = thoiGianThayDoi;
    }

    public String getChiTietThayDoi() {
        return this.chiTietThayDoi;
    }

    public void setChiTietThayDoi(String chiTietThayDoi) {
        this.chiTietThayDoi = chiTietThayDoi;
    }

    public Integer getIdDatPhong() {
        return this.idDatPhong;
    }

    public void setIdDatPhong(Integer idDatPhong) {
        this.idDatPhong = idDatPhong;
    }
}
