class Solution {
    public long dividePlayers(int[] skill) {
         Arrays.sort(skill);// 1 2 3 3 4 5
         int l=0;
         int r=skill.length-1;
         long totalskill=skill[l] + skill[r];
         long product=0;
         while(l<r){
            if(totalskill!=skill[l]+skill[r]){
                return -1;
            }
             product+=skill[l]*skill[r];
            l++;
            r--;
        
         }
         return product;

    }
}