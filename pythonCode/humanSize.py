SUFFIXES = {
            1000: ['KB', 'MB', 'GB', 'TB', 'PB', 'EB', 'ZB', 'YB'],
            1024: ['KiB', 'MiB', 'GiB', 'TiB', 'PiB', 'EiB', 'ZiB', 'YiB']}

def approximate_size(size, kilobyte_1024=True):
    '''Convert a file size to human-readable form.
    Returns: string
    '''
    #print(approximate_size.__doc__)
    if size < 0:
            raise ValueError('number must be non-negative')

    multiple = 1024 if kilobyte_1024 else 1000

    for suffix in SUFFIXES[multiple]:
            size /= multiple
            if size < multiple:
                return '{0:.1f} {1}'.format(size, suffix)

    raise ValueError('number too large')

if __name__ == '__main__':
    print(approximate_size(1000000000000, False)) #1.0 TB
    print(approximate_size(1000000000000)) #931.3GiB
    print(approximate_size(100, False)) #0.1KB
    print(approximate_size(-100)) #a ValueError is raised!
