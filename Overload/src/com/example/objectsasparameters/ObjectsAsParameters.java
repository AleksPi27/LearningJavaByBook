package com.example.objectsasparameters;

public class ObjectsAsParameters {

    int a,b;

    public ObjectsAsParameters(int i, int j)
    {
        a=i;
        b=j;
    }

    public ObjectsAsParameters(ObjectsAsParameters o)
    {
        a=o.a;
        b=o.b;
    }

   public boolean equalTo(ObjectsAsParameters o)
    {
        if (a==o.a && b==o.b) return true;
        else return false;
    }
}
