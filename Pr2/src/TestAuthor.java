public class TestAuthor {
        public static void main(String[] args) {
            Author a1 = new Author("Ivan Popov", "ivPopov@somewhere.com", 'm');
            Author a2 = new Author("Anna Ivanova", "anIvanova@somewhere.com", 'f');
            Author a3 = new Author("Anna Ivanova", "", 'f');
            a3.setEmail("anIvanova@somewhere.com");
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);

        }
}
