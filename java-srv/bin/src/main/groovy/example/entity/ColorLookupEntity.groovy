package example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.OptimisticLockType;

@Entity
@org.hibernate.annotations.Entity(dynamicUpdate = true, optimisticLock = OptimisticLockType.ALL)
@Table(name = "colorLookup")
public class ColorLookupEntity {

  @Id
  @Column(unique = true, nullable = false)
  private Integer id;

  @Column(nullable = false, length = 10)
  private String color;

  public ColorLookupEntity(int a, String b){ id=a; color=b;}

  public Integer getId(){ return id;}
  public void setId(Integer value){id = value;}

  public String getColor(){ return color;}
  public void setColor(String value){color = value;}

  @Override
  public String toString(){return String.format("[OUTPUT] %d, color=%s", id, color);}
}
