import json,codecs
def jsonify(obj, out_file):
    """
    Inputs:
    - oxbj: the object to be jsonified
    - out_file: the file path where obj will be saved
    This function saves obj to the path out_file as a json file.
    """
    json.dump(obj, codecs.open(out_file, 'w', encoding='utf-8'), separators=(',', ':'), sort_keys=True, indent=4)


def unjsonify(in_file):
    """
    Input:
    -in_file: the file path where the object you want to read in is stored
    Output:
    -obj: the object you want to read in
    """
    obj_text = codecs.open(in_file, 'r', encoding='utf-8').read()
    obj = json.loads(obj_text)
    return obj

dic={"a":3,
     "b":5,
     "c":6}

jsonify(dic, "test.json")
newdic=unjsonify("test.json")
print newdic