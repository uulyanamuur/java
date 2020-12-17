public class TestClient {

    public static void main(String[] args) {

        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client(chairFactory.createFunctionalChair());

        client.sit();

        client.setChair(chairFactory.createMagicChair());

        client.sit();

        client.setChair(chairFactory.createVictorianChair());

        client.sit();
    }
}