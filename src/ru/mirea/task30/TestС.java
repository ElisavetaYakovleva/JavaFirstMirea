package ru.mirea.task30;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
public class TestС {

    @Test
    public void getAllClients() {
        Client client = new Client("Глаша", 345678);
        Client client1 = new Client("Галина", 3000);
        Client client2 = new Client("Раиса", 450);

        ArrayList<Client> expected = Client.getAllClients();

        ArrayList<Client> actual = new ArrayList<>();
        actual.add(client);
        actual.add(client1);
        actual.add(client2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyClients() {
        Client client = new Client("Глаша", 345678);
        Client client1 = new Client("Галина", 3000);
        Client client2 = new Client("Раиса", 450);

        int expected = Client.getHowManyClients();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllBalanceClients() {
        Client client = new Client("Глаша", 345678);
        Client client1 = new Client("Галина", 3000);
        Client client2 = new Client("Раиса", 450);

        int expected = Client.getAllBalanceClients();

        int actual = 345678+3000+450;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageBalanceOfAllClients() {
        Client client = new Client("Глаша", 345678);
        Client client1 = new Client("Галина", 3000);
        Client client2 = new Client("Раиса", 450);

        int expected = Client.getAverageBalanceOfAllClients();

        int actual = (345678+3000+450)/3;

        Assert.assertEquals(expected, actual);
    }
}
