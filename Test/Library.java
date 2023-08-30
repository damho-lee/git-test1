package Test;

public class Library {
    private String[] books;
    private int top = 0;
    public Library(int size) {
        if(size<1)
            throw new IllegalArgumentException("도서관 크기는 1보다 작은 값을 넣을 수 없습니다.");
        books = new String[size];
    }

    public void add(String title) {
        if(top==books.length) {
            throw new IllegalArgumentException("책장이 꽉 찼습니다. 책장을 비워주세요");
//            System.out.println("책장이 꽉 찼습니다. 책장을 비워주세요");
//            return;
        }
        for(int i=0; i<top; i++) {
            if(books[i].equals(title)) {
                System.out.println("[" + title + "] 은 이미 있는 책입니다.");
                return;
            }
        }
        books[top++] = title;
        System.out.println("[" + title + "] 책을 추가 했습니다.");
    }

    public void delete(String title) {
        if(top==0)
            throw new IllegalArgumentException("책장이 비어있어서 삭제가 불가능합니다.");
        for(int i=0; i<top; i++) {
            if(books[i].equals(title)) {
                System.out.println("[" + title + "] 책을 삭제하였습니다.");
                after(i);
                return;
            }
        }
        throw new IllegalArgumentException("없는 책 [" + title + "] 삭제할 수 없습니다.");
    }

    public void find(String title) {
        for(int i=0; i<top; i++) {
            if(books[i].equals(title)) {
                System.out.println("책 검색 결과 : " + title);
                return;
            }
        }
        System.out.println(title + "는 없는 책입니다.");
    }

    public void findall() {
        System.out.println("\n모든 책 출력 :");
        System.out.println("=====================");
        for(int i=0; i<top; i++) {
            System.out.println(i+1 + " : " + books[i]);
        }
        System.out.println("=====================");

    }
    public void after(int index) {
        for(int i=index; i<books.length-1; i++) {
            books[i] = books[i+1];
        }
        books[books.length-1] = "";
        top--;
    }
}
