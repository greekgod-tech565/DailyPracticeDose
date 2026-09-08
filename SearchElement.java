int target = 5;
boolean found = false;

for (int i = 0; i < arr.length; i++) {

    for (int j = 0; j < arr[i].length; j++) {

        if (arr[i][j] == target) {
            System.out.println("Found at: " + i + "," + j);
            found = true;
        }

    }
}

if (!found) {
    System.out.println("Not found");
}
