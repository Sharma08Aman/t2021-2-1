keys=[1,2,3,4,5,6,7,8,9]
input_list=[1,2,8,9,12,46,76,82,15,20,30]
multiple_count=list()
for i in range(0, len(keys)):
    count=0
    for j in range(0, len(input_list)):
        if input_list[j]%keys[i]==0:
            count+=1        
    multiple_count.insert(i,count)
output_dictionary=dict(zip(keys, multiple_count))
print(output_dictionary)
