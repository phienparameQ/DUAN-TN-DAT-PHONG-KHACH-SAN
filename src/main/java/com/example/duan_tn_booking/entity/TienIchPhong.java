
import javax.persistence.*;

@Entity
@Table(name = "TienIchPhong")
public class TienIchPhong {
    @Id
    @Column(name = "id_tien_ich_phong")
    private Integer idTienIchPhong;

    @Column(name = "ma_tien_ich")
    private String maTienIch;

    @Column(name = "ten_tien_ich")
    private String tenTienIch;

    @Column(name = "tinh_trang")
    private Boolean tinhTrang;

    public Integer getIdTienIchPhong() {
        return this.idTienIchPhong;
    }

    public void setIdTienIchPhong(Integer idTienIchPhong) {
        this.idTienIchPhong = idTienIchPhong;
    }

    public String getMaTienIch() {
        return this.maTienIch;
    }

    public void setMaTienIch(String maTienIch) {
        this.maTienIch = maTienIch;
    }

    public String getTenTienIch() {
        return this.tenTienIch;
    }

    public void setTenTienIch(String tenTienIch) {
        this.tenTienIch = tenTienIch;
    }

    public Boolean getTinhTrang() {
        return this.tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
