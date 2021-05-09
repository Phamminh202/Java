package java02;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        List<String> Phim=new ArrayList<>();
        Phim.add("Naruto");
        Phim.add("One Piece");
        Phim.add("Dragon");

        int nn=1;
        do {
            System.out.println("Danh sách tác vụ:");
            System.out.println("1.Thêm phim mới\n2.Xem phim đã lưu\n3.Sửa tên\n4.Xóa phim\n5.Tìm kiếm");
            Scanner nnn=new Scanner(System.in);
            int chon=nnn.nextInt();
            switch (chon){
                case 1:
                    int n=1;
                    do {
                        System.out.print("Nhập tên phim bạn yêu thích:");
                        Scanner a = new Scanner(System.in);
                        String tenmoi = a.next();
                        Phim.add(tenmoi);
                        System.out.println("Đã thêm thành công phim "+tenmoi+" ở vị trí số "+(Phim.indexOf(tenmoi)+1));
                        System.out.println("Tiếp tục thêm ấn 1");
                        Scanner scanner=new Scanner(System.in);
                        n=scanner.nextInt();
                    }while (n==1);
                    break;
                case 2:
                    System.out.println("Danh sách phim đã lưu của bạn:");
                    System.out.println(Phim);
                    System.out.println("Ấn 1 để tiếp tục tác vụ");
                    Scanner scanner=new Scanner(System.in);
                    nn=scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Chọn số thứ tự của bộ phim bạn muốn sửa:");
                    Scanner m=new Scanner(System.in);
                    int b=m.nextInt();
                    Phim.get(b);
                    System.out.print("Nhập tên bạn sửa:");
                    Scanner mm=new Scanner(System.in);
                    String c=mm.next();
                    Phim.set(b,c);
                    System.out.println("Ấn 1 để tiếp tục tác vụ");
                    Scanner scanne=new Scanner(System.in);
                    nn=scanne.nextInt();
                    break;
                case 4:
                    System.out.print("Chọn số thứ tự của bộ phim bạn muốn xóa:");
                    Scanner mmm=new Scanner(System.in);
                    int d=mmm.nextInt();
                    Phim.get(d);
                    Phim.remove(d);
                    System.out.println("Đã xóa thành công");
                    System.out.println("Ấn 1 để tiếp tục tác vụ");
                    Scanner scann=new Scanner(System.in);
                    nn=scann.nextInt();
                    break;
                case 5:
                    System.out.printf("Nhập kí tự:");
                    Scanner k=new Scanner(System.in);
                    String e=k.nextLine();
                    System.out.println("Phim "+e+" ở vị trí số "+Phim.indexOf(e));
                    System.out.println("Ấn 1 để tiếp tục tác vụ");
                    Scanner scan=new Scanner(System.in);
                    nn=scan.nextInt();
                    break;
            }
        }while (nn==1);


    }
}
