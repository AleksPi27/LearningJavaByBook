package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnitTest {
@Test
public void youCreateAUnitGivenItsHealthAndDamage()
{
    new Unit(100,25);
}

@Test
    public void youCheckUnitHealtWithGetter()
{
    Unit unit=new Unit(100,25);
    assertEquals(100,unit.getHealth());
}

@Test
    public void unitCanTakeDamage(){
    Unit unit=new Unit(100,25);
    unit.takeDamage(25);
}

@Test
    public void damageTakenReducesUnitHealth()
{
    Unit unit=new Unit(100,25);
    unit.takeDamage(25);
    assertEquals(75,unit.getHealth());
}
    @Test
    public void unitCanDealDamageToAnotherUnit() {
        Unit damageDealer = new Unit(100, 25);
        Unit damageTaker = new Unit(100, 25);
        damageDealer.dealDamage(damageTaker);
    }
   @Test
    public void unitThatDamageDealtToTakesDamageDealerUnitDamage()
   {
       Unit damageDealer = new Unit(100,25);
       Unit damageTaker = new Unit(100,25);
       damageDealer.dealDamage(damageTaker);
       assertEquals(75,damageTaker.getHealth());
   }
}