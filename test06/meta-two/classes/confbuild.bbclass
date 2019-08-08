
inherit my_build

confbuild_do_configure() {
    echo "run configbuild_do_configure."
}

addtask do_configure before do_build
EXPORT_FUNCTIONS do_configure
