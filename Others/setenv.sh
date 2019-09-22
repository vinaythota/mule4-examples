# This is the file bin/setenv.sh,
# it will be sourced in by bin/jmeter

# Use a bigger heap, but a smaller metaspace, than the default
export JVM_ARGS="-Xms1G -Xmx1G -Xss256k"
