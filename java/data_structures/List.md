# List

| Method | Description |
| --- | --- |
| .add(Value) | Append value - O(1) |
| .get(Index) | Get value by index - O(1) | 


## Iterating thougth list

```java
ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 2, 1, 6, 5));
for (int i = 0; i < nums.size(); i++) {
    System.out.println(nums.get(i));
}
```

## Sort

```java
ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 2, -1, 6, 5, 9));
Collections.sort(nums);
```

#### List\<Integer>

```java
List<Integer> result = new ArrayList<>();
List<Integer> unitTestOne = new ArrayList<>(Arrays.asList(36, 64, 36, 64, 1));
```