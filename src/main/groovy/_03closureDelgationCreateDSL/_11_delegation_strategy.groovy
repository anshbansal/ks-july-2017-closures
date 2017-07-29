package _03closureDelgationCreateDSL

Closure<Integer> cls = { Integer a, Integer b ->
    a + b
}

println cls.resolveStrategy

/*
int OWNER_FIRST = 0; //Default strategy
int DELEGATE_FIRST = 1;
int OWNER_ONLY = 2;
int DELEGATE_ONLY = 3;
int TO_SELF = 4;
 */