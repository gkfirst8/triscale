package nl.first8.test.triscale;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class FlowersService {
    private Map<String, Flower> flowers = new HashMap<>();

    @PostConstruct
    public void setup() {
        add(new Flower("1", "Rose", "Red"));
        add(new Flower("2", "Rose", "Yellow"));
        add(new Flower("3", "Rose", "White"));
        add(new Flower("4", "Daffodil", "Yellow"));
        add(new Flower("5", "Lily", "White"));
    }

    public List<Flower> getFlowers() {
        return new ArrayList<>(flowers.values());
    }

    public void add(Flower flower) {
        flowers.put(flower.getId(), flower);
    }

    public Flower get(String id) {
        return flowers.get(id);
    }
}
