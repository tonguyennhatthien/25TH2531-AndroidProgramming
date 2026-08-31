package till.edu.danhsachtinhthanh;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Hiển thị dữ liu lên ListView
        // B1+: Cần có dữ liệu
        // ?? từ đâu có: từ cơ sở dữ liệu (SQL, noSQL, XML,...)
        // ở bài này, chúng ta hard-code dữ liệu trực tiếp
        // cần biến phù hợp để chứa dữ lệu
        ArrayList<String> dsTenTinhThanhVN; // khai báo
        dsTenTinhThanhVN = new ArrayList<String>();  // tạo thể hiện cụ thể, xin mới
          // thêm dữ liệu ở đây  ( đúng ra, ta phải đọc từ một nguồn
          // nhưng ta hard-code (cho sẵn để demo)
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");

        // B2. Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                                                    android.R.layout.simple_list_item_1,
                                                    dsTenTinhThanhVN);
        // B3. Gắn vào điều khiển hiển thị ListView
        // 3.1, Tìm
        ListView lvTenTinhThanh= findViewById(R.id.lvDanhSachTT);
        // 3.2, Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3. Lắng nghe và xử lý sự kiện user tương tác
        // để sau


    }
}