# insert into dictionary
def insert_dict(query, dict):
    dict[query[1]] = int(query[2])
    return "Inserted"

# deleting from dictionary
def del_dict(query, dict):
    del dict[query[1]]
    return "Deleted"

# print marks of required name
def print_dict(key, dict):
    if key in dict:
        print(f"Marks of {key} is {dict[key]}")
    else:
        print(-1)