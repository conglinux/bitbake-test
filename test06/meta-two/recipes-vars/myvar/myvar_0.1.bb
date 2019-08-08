DESCRIPTION = "Show access to global MYVAR"
PR = "r1"

do_build(){
  echo "myvar_sh: ${MYVAR}"
  echo "myvar_sh: ${GITDIR}"
}

python do_myvar_py () {
  print ("myvar_py:" + d.getVar('MYVAR', True))
}

addtask myvar_py before do_build
