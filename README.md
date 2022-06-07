

|#|Các thành phần của chương trình|Giải thích|
| :- | :- | :- |
|1|Core/AbstractApartment (Class)|Class abstract chưa thành phần trừu tượng cho căn hộ|
|2|Core/AbstractRoom (Class)|Class abstract chưa thành phần trừu tượng cho phòng|
|3|Helper/IcorectInput (Class)|Class handle lỗi nhập sai dữ liệu|
|4|Helper/WriteObject (Class)|Class đọc ghi dữ liệu|
|5|Interfacefactory/IApartment (Interface)|Interface chứa các chức năng cho căn hộ|
|6|Interfacefactory/ICom (Interface)|Interface mô hình chung cho 2 kiểu dữ liệu căn hộ và phòng (Generic function chức năng cho cả 2 loại dữ liệu trên)|
|7|Interfacefactory/IRoom (Interface)|Interface chứa các chức năng cho phòng|
|8|Material/Apartment|Class loại căn hộ cụ thể|
|9|Material/Room|Class loại căn phòng cụ thể|
|10|Main|Hàm chạy của chương trình|



Bảng phân tích class main

|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1|WriteData||Lưu dữ liệu căn hộ vào file save.txt khi chương trình run|
|2|GetApartment||Chương trình đọc dữ liệu căn hộ từ file và chuyển dữ liệu về dạng chuẩn|
|3|InputData||Chức năng menu tạo phòng và căn hộ và thêm phòng vào căn hộ khi gọi đễn các hàm nhỏ khác|
|4|addRoomToApartment||Hàm này có chức năng thêm phòng vào căn hộ dựa theo id phòng và id căn hộ|
|5|ResultItemOfArray||Hàm này trả về object phòng hoặc căn hộ dựa vào id|
|6|addApartment||Hàm này có chức năng thêm căn hộ khi chương trình chạy nhưng không tự động lưu vào file|
|7|addRoom||Hàm này có chức năng thêm phòng khi chương trình chạy nhưng không tự động lưu vào file|
|||<p>+ listApartment</p><p>+listRoom</p>|2 biến trên là 2 biên lưu danh sách căn hộ và phòng khi chương trình chạy|







Bảng phân tích class AbstractApartment


|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1||<p>+ Id</p><p>+ Usage\_id</p><p>+ Name</p><p>+ Floor</p>|<p>+ mã căn hộ</p><p>+ mã đã sử dụng để không bị trùng lặp</p><p>+ tên căn hộ</p><p>+ số tầng</p>|
|2|getId||Lấy id|
|3|setId||Set id|
|4|getName||Lấy tên căn hộ|
|5|getListRoom||Lấy ra danh sách phòng có trong căn hộ|
|6|toString||override chế độ hiển thị object|
|7|setListRoom||Set dánh sách phòng|
|8|setRoom||Thêm 1 phòng vào trong danh sách hiện có|
|9|setName||set tên căn hộ|
|10|getFloor||Lấy ra số tầng|
|11|setFloor||Set số tầng|

AbstractRoom



|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1||<p>+ Id</p><p>+ Usage\_id</p><p>+ Name</p><p>+ Floor</p>|<p>+ mã phòng</p><p>+ mã đã sử dụng để không bị trùng lặp</p><p>+ tên phòng</p>|
|2|<p>getNumberPerson</p><p></p>||Get số người đang ở trong căn phòng|
|3|<p>setNumberPerson</p><p></p>||Set số người ở phòng|
|4|<p>toString</p><p></p>||override chế độ hiển thị object|
|5|<p>getId</p><p></p>||get id|
|6|<p>setId</p><p></p>||set id|
|7|<p>SetOwn</p><p></p>||Set chủ căn phòng|



Bảng phân tích WriteObject

|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1||<p>FileName</p><p>object</p><p></p>|<p>Tên file</p><p>Đối tượng</p>|
|2|<p>WriteObject</p><p></p>||Set path file cần ghi|
|3|<p>setContent</p><p></p>||set object và convert object theo dạng ghi |
|4|<p>Write</p><p></p>||Hàm này có chức năng ghi đối tượng vào fille|
|5|<p>ReadFile</p><p></p>||Đọc file|






Bảng phân tích interface IApartment





|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1|<p>SetRoom</p><p></p>|||


Bảng phân tích interface  ICom

|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1|<p>getId</p><p></p>|||


interface IRoom

|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |




Bảng phân tích Apartment

|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1|<p>Apartment</p><p></p>||Hàm constructor|
||<p>toStringRoom</p><p></p>||Hàm chuyển array list room về dạng string|
||<p>getOwn</p><p></p>||get chủ sở hữu|
||setOwn||set chủ sở hữu|
||setRoom||set phòng vào đối tượng|






Room

|#|Hàm|Biến|Chú thích|
| :- | :- | :- | :- |
|1|<p></p><p></p>|<p>own</p><p></p>|do đã kế thừa từ abstracRoom nên hiện tại chưa có thành phần khác|
||getOwn|||
||<p>toString</p><p></p>|||
||<p>SetOwn</p><p></p>|||


