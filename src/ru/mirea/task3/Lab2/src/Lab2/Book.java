package Lab2;

public class Book {
        private String name;
        private String author;
        private int year;
        private int number_of_pages;
        public Book(String name, String author, int year, int number_of_pages){
            this.name=name;
            this.author=author;
            this.year=year;
            this.number_of_pages=number_of_pages;
        };
        public void setName(String name){
            this.name=name;
        }
        public void setAuthor(String author){
            this.author=author;
        }
        public void setYear(int year){
            this.year=year;
        }
        public void setNumber_of_pages(int number_of_pages){
            this.number_of_pages=number_of_pages;
        }
        public int getNumber_of_pages() {
            return number_of_pages;
        }
        public int getYear() {
            return year;
        }
        public String getName() {
            return name;
        }
        public String getAuthor() {
            return author;
        }
}
