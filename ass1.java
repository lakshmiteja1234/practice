public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
	int p = 0;
	for(int i = 0; i < nums.length; i++)
	{
		if(nums[i] != 10)
		{
			arr[p] = nums[i];
			p++;
		}
	}
	// Java arrays are initialized to 0 so no need to set the last elements to 0
	return arr;
}


