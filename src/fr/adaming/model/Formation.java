package fr.adaming.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Formation {
@Id
@GeneratedValue
private int idFormation;
private String theme;
public Formation(int idFormation, String theme) {
	super();
	this.idFormation = idFormation;
	this.theme = theme;
}
public Formation() {
	super();
}
public int getIdFormation() {
	return idFormation;
}
public void setIdFormation(int idFormation) {
	this.idFormation = idFormation;
}
public String getTheme() {
	return theme;
}
public void setTheme(String theme) {
	this.theme = theme;
}
@Override
public String toString() {
	return "Formation [idFormation=" + idFormation + ", theme=" + theme + "]";
}


}
