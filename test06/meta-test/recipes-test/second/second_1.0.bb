DESCRIPTION = "This is the second recipe"
PN = "second"
PV = "1.0"
PR = "a1"

inherit my_build

def my_py_func(o):
    print (dir (o))

  
python do_mypatch () {
  bb.note ("run mypatch")
  my_py_func(d) 
}
addtask mypatch before do_build
#addtask mypatch after do_build
