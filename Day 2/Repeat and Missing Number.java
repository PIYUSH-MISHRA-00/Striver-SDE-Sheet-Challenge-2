class Solution {
List<Integer> find_missing_repeating(int[] array) {
    int n = array.length + 1;

    int[] substitute = new int[n];
    List<Integer> ans = new ArrayList<>();
    for (int i = 0; i < array.length; i++)
    {
        substitute[array[i]]++;
    }

    for (int i = 1; i <= array.length; i++)
    {
        if (substitute[i] == 0 || substitute[i] > 1)
        {
            ans.add(i);
        }
    }

    return ans;
}
}