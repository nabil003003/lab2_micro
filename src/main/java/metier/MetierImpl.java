package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    @Autowired
    @Qualifier("dao2")  // Spécifie quelle implémentation de IDao utiliser
    private IDao sourceDonnees;

    @Override
    public double calcul() {
        return sourceDonnees.getValue() * 2;
    }

    public void setSourceDonnees(IDao sourceDonnees) {
        this.sourceDonnees = sourceDonnees;
    }
}
